package org.icroco.chat.parser;/*
								* Copyright 2015 the original author or authors.
								*
								* Licensed under the Apache License, Version 2.0 (the "License");
								* you may not use this file except in compliance with the License.
								* You may obtain a copy of the License at
								*
								* http://www.apache.org/licenses/LICENSE-2.0
								*
								* Unless required by applicable law or agreed to in writing, software
								* distributed under the License is distributed on an "AS IS" BASIS,
								* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
								* See the License for the specific language governing permissions and
								* limitations under the License.
								*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

//https://github.com/antlr/intellij-plugin-v4/blob/master/src/adaptor/org/antlr/intellij/adaptor/parser/SyntaxError.java

public class SyntaxErrorListener extends BaseErrorListener {
	private final List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

	public SyntaxErrorListener() {
	}

	public List<SyntaxError> getSyntaxErrors() {
		return syntaxErrors;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
			int charPositionInLine, String msg, RecognitionException e) {
		syntaxErrors.add(new SyntaxError(recognizer, offendingSymbol, line,
				charPositionInLine, msg, e));
	}

	@Override
	public String toString() {
		return syntaxErrors.stream().map(Object::toString)
				.collect(Collectors.joining("\n"));
	}

	public boolean hasError() {
		return !syntaxErrors.isEmpty();
	}
}

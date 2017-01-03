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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class PrintSmartRfq {

	public void parseSmartRfq(String smartRfq) {
		SmartRfqLexer lexer = new SmartRfqLexer(new ANTLRInputStream(smartRfq));
		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		SmartRfqParser parser = new SmartRfqParser(tokens);

		// Specify our entry point
		final SmartRfqParser.SmartrfqContext smartrfq = parser.smartrfq();
	}

	public static void main(String[] args) {
		final PrintSmartRfq printSmartRfq = new PrintSmartRfq();
		printSmartRfq.parseSmartRfq("+200k");
	}
}

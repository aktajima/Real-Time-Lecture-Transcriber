/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.amazonaws.transcribestreaming;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.PrintWriter;
import java.io.IOException;

public class TranscribeStreamingDemoApp extends Application {

    @Override
    public void start(Stage primaryStage)  {

        WindowController windowController = new WindowController(primaryStage);
	    try {
		PrintWriter writer = new PrintWriter("output.txt");
writer.print("");
writer.close();
		//PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", false)));
		//writer.print("");
		//writer.close();
            //writeFile = new BufferedWriter(new FileWriter("./output.txt"), Integer.MAX_VALUE);
		}
	    catch(IOException e){
		System.err.println("File doesnt exist");
		}

        primaryStage.setOnCloseRequest(__ -> {
            windowController.close();
            System.exit(0);
        });
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }

}

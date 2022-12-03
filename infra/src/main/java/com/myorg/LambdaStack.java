package com.myorg;

import software.amazon.awscdk.Duration;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;

public class LambdaStack extends Stack {
    public LambdaStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public LambdaStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);

        Function.Builder.create(this, "docx-to-pdf")
                .runtime(Runtime.JAVA_11)
                .handler("org.example.Functions")
                .memorySize(128)
                .timeout(Duration.seconds(20))
                .functionName("DocxToPdf")
                .code(Code.fromAsset("../assets/function.jar"))
                .build();
    }
}

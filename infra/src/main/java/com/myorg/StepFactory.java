package com.myorg;

import software.amazon.awscdk.App;

public final class StepFactory {
    public static void main(final String[] args) {
        App app = new App();

        new LambdaStack(app, "LambdaStack");

        app.synth();
    }
}

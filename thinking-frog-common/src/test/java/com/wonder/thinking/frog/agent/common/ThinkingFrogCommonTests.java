package com.wonder.thinking.frog.agent.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThinkingFrogCommonTests {

    @Test
    void shouldExposeProjectNameConstant() {
        assertEquals("thinking-frog-agent", CommonConstants.PROJECT_NAME);
    }
}

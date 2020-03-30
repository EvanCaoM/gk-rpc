package com.smgeak.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setName("smgeak");
        bean.setAge(18);
        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}
package com.smgeak.gkrpc.server;

import com.smgeak.gkrpc.codec.Decoder;
import com.smgeak.gkrpc.codec.Encoder;
import com.smgeak.gkrpc.codec.JSONDecoder;
import com.smgeak.gkrpc.codec.JSONEncoder;
import com.smgeak.gkrpc.transport.HTTPTransportServer;
import com.smgeak.gkrpc.transport.TransportServer;
import lombok.Data;

@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}

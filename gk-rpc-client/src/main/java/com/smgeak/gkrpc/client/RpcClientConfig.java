package com.smgeak.gkrpc.client;

import com.smgeak.gkrpc.Peer;
import com.smgeak.gkrpc.codec.Decoder;
import com.smgeak.gkrpc.codec.Encoder;
import com.smgeak.gkrpc.codec.JSONDecoder;
import com.smgeak.gkrpc.codec.JSONEncoder;
import com.smgeak.gkrpc.transport.HTTPTransportClient;
import com.smgeak.gkrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass =
            HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass =
            JSONEncoder.class;
    private Class<? extends Decoder> decoderClass =
            JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}

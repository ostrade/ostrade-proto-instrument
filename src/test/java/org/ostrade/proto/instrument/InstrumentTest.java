package org.ostrade.proto.instrument;

import org.junit.jupiter.api.Test;

public class InstrumentTest {

    @Test
    void instrument() {
        Instrument instrument = Instrument.newBuilder()
                .setSymbol("CLF31")
                .build();
    }

}

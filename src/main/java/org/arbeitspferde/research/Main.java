package org.arbeitspferde.research;

import org.arbeitspferde.groningen.proto.Event;

public class Main {
    public static void main(final String ...unused) throws Exception {
        Event.EventEntry.Builder builder = Event.EventEntry.newBuilder();

        builder.addJvmFlagBuilder()
                .setManagedByGroningen(true)
                .setName("-Xmx")
                .setValue("5G");
        builder.addJvmFlagBuilder()
                .setManagedByGroningen(true)
                .setName("-XX:NewSize")
                .setValue("300M");
        builder.addPauseEventBuilder()
                .setDurationInSeconds(0.6);
        builder.addScoreBuilder()
                .setName("LATENCY")
                .setCoefficient(1)
                .setScore(50);
        builder.addScoreBuilder()
                .setName("THROUGHPUT")
                .setCoefficient(0.1F)
                .setScore(10);

        builder.setType(Event.EventEntry.Type.EXPERIMENT_END);
        builder.setTime(System.currentTimeMillis());

        builder.build().writeDelimitedTo(System.out);
    }
}






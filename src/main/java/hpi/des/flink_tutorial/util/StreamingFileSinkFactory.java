package hpi.des.flink_tutorial.util;

import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.api.java.tuple.Tuple7;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.functions.sink.filesystem.StreamingFileSink;

public class StreamingFileSinkFactory {

    static public <IN> StreamingFileSink<IN> newSink(String pathToDir){
        return StreamingFileSink.forRowFormat(
                new Path(pathToDir),
                new SimpleStringEncoder<IN>("UTF-8")).build();
    }
}

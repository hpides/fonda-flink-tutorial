package hpi.des.flink_tutorial.session1;

import hpi.des.flink_tutorial.util.InputFile;

import hpi.des.flink_tutorial.util.TaxiRideTuple;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple7;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.time.LocalDateTime;

public class TipInvestigation {

    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        DataStreamSource<String> sourceStream = env.readTextFile(InputFile.getInputFilePath());

        sourceStream.flatMap(new TransformSourceStreamOperator())
//                .map(new )

//                .map(new Exercise1Operator())
                // exercise 1
                // exercise 2
                // exercise 3
                // exercise 4
                // exercise 5
                .print();



        env.execute("Exercise Session 1");
    }
}

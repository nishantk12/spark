package spark_example.spark_example;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkConnectiontest {
	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("app2").setMaster("spark://X.X.X.X:7077");  //this must be the spark URL
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
		JavaRDD<Integer> distData = sc.parallelize(data);
		System.out.println(distData.count());
		
	}
}

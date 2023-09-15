package com.sparkPlay.runner

import org.apache.spark.sql.SparkSession

object mypipeline {
  def main(args: Array[String]):Unit = {
    try {
      val spark = SparkSession.builder.master(master = "local")
        .appName("sample")
        .enableHiveSupport()
        .getOrCreate()


      val testDF = spark
        .read
        .option("header", "true")
        .option("delimiter", ";")
        .csv("/Users/yash/Downloads/username.csv")

      testDF.printSchema()
      testDF.show()

      testDF
        .write
        .format("csv")
        .mode("overwrite")
        .save("/Users/yash/Downloads/toutput")
    } catch {
      case e: Exception => "some error occured"
    }
    }
}

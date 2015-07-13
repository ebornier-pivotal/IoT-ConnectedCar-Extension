# IoT-ConnectedCar-HAWQ

This projet illustrates HAWQ value in the IoT-ConnectedCar demo.

Data comming from ODB devices are ingested by Spring-XD. A specific tap transforms data into a columnar format and stores it into HDFS.

An external HAWQ table (using PXF) enables to query ODB Data, and draw graph inside Tableau Desktop software.

## Setup

1.Prequisites :

- Spring XD 1.2 (but should work with Spring XD 1.1)
- PHD 3.0
- to complete

2.Create the ODB_DATA table

Log in as a gpadmin.

Run the following command :  psql -f create_odb.sql 

3.Create the stream IoT-HAWQ :

Run the following command : xd-shell --cmdfile stream-IoT-HAWQ.xd 

This stream needs the IoT-HTTP stream defined in IoT-ConnectedCar demo. The user should also needs the suitable write access to HDFS.

4.Make a simple query

Run the following command : psql -f sql_query_example.sql to show odb_data content.

5.Install Tableau Desktop (trial version or with a valid key)

 You can easily draw such graph (see below) showing (vehicule speed / time) based on sql_query_example.sql.
 
 ![Tableau HAWQ](https://raw.githubusercontent.com/ebornier-pivotal/IoT-ConnectedCar-Extension/master/IoT-ConnectedCar-HAWQ/Tableau-HAWQ.png)
 



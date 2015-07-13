CREATE EXTERNAL TABLE odb_data
(
    vin varchar(50),
    time_since_engine_start integer,
    vehicle_speed integer,
    longitude decimal,
    latitude decimal
)
LOCATION ('pxf://localhost:50070/IoT/hawq/travel-*.txt?profile=HdfsTextSimple') 
FORMAT 'TEXT' (DELIMITER = E'\t');

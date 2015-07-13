import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
def jsonPayload = slurper.parseText(payload)
def vin = jsonPayload?.vin
def vehicle_speed = jsonPayload?.vehicle_speed
def time_since_engine_start = jsonPayload?.time_since_engine_start
def longitude = jsonPayload?.longitude
def latitude = jsonPayload?.latitude

def result = vin + '\t' + time_since_engine_start + '\t' + vehicle_speed + '\t' + longitude + '\t' + latitude;

return result

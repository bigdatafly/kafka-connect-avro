package com.bigdatafly.kafka.serializers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractKafkaAvroSerializer extends AbstractAvroSerDe {

	private static final Logger logger = LoggerFactory.getLogger(AbstractKafkaAvroSerializer.class);
	private final EncoderFactory encoderFactory = EncoderFactory.get();
	
	protected byte[] serializer(Object obj){
		
		if(obj == null)
			return null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		
		try {
			if(obj instanceof byte[]){
				out.write((byte[])obj);
			}else{
				BinaryEncoder encoder = encoderFactory.directBinaryEncoder(out, null);
				DatumWriter<Object> writer;
				
				Object value = obj;
				
				if(value instanceof SpecificRecord){
					
					writer  = new SpecificDatumWriter<>();
				}else if(value instanceof GenericRecord){
					writer = new GenericDatumWriter<>();
				}
				
			}
			
			
		} catch (IOException e) {
				
				e.printStackTrace();
			
		}
		
		
		return out.toByteArray();
			
	}
}

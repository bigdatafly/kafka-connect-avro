/**
 * 
 */
package com.bigdatafly.kafka.serializers;

import kafka.serializer.Encoder;

/**
 * @author summer
 *
 */
public class KafkaAvroEncoder extends AbstractKafkaAvroSerializer implements Encoder<Object>{

	public byte[] toBytes(Object arg0) {
		
		return null;
	}

}

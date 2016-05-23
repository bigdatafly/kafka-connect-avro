/**
 * 
 */
package com.bigdatafly.kafka.serializers;

import java.util.Map;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

/**
 * @author summer
 *
 */
public class AbstractKafkaAvroSerDeConfig extends AbstractConfig{

	public AbstractKafkaAvroSerDeConfig(ConfigDef definition, Map<?, ?> originals) {
		super(definition, originals);
		// TODO Auto-generated constructor stub
	}

}

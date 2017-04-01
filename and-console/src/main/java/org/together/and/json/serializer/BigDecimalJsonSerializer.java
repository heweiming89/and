package org.together.and.json.serializer;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class BigDecimalJsonSerializer {

	public static class Serializer extends JsonSerializer<BigDecimal> {

		@Override
		public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers)
				throws IOException, JsonProcessingException {
			// TODO Auto-generated method stub

		}

	}

	public static class Deserializer extends JsonDeserializer<BigDecimal> {

		@Override
		public BigDecimal deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {
			// TODO Auto-generated method stub
			return null;
		}

	}

}

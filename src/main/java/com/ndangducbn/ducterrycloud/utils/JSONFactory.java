
package com.ndangducbn.ducterrycloud.utils;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.gson.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.Date;


public abstract class JSONFactory {

    private static JsonSerializer<Date> date2Timestamp = new JsonSerializer<Date>() {
        public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            
        }

        public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
            return src == null ? null : new JsonPrimitive(src.getTime());
        }
    };

    private static JsonDeserializer<Date> timestamp2Date = new JsonDeserializer<Date>() {
        public Date deserialize(com.fasterxml.jackson.core.JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return null;
        }

        public Date deserialize(JsonElement json, Type typeOfT,
                                JsonDeserializationContext context) throws JsonParseException {
            return json == null ? null : new Date(json.getAsLong());
        }
    };

    private static JsonDeserializer<ZonedDateTime> string2ZonedDateTime = (json, typeOfT, context) -> json == null ? null : ZonedDateTime.parse(json.getAsString());

    private static Gson gson = create();

    private static Gson getInstance() {
        if (gson == null) {
            gson = create();
        }
        return gson;
    }

    public static Gson create() {
        return new GsonBuilder()
                .registerTypeAdapter(ZonedDateTime.class, string2ZonedDateTime)
                .registerTypeAdapter(Date.class, date2Timestamp)
                .registerTypeAdapter(Date.class, timestamp2Date)
                .disableHtmlEscaping().create();
    }

    public static String toJson(Object object) {
        return getInstance().toJson(object);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static Object fromJSON(String json, Class paramClass) throws JsonSyntaxException {
        return getInstance().fromJson(json, paramClass);
    }

    public static <T extends Object> T fromJSON(String json, Type type) {
        return getInstance().fromJson(json, type);
    }

}


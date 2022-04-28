package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.aspectj.runtime.internal.Conversions;

import java.io.Serializable;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record BookRecord (
        String title,
        String author,
        String publisher,
        Long priceInCents,
        String url
) implements Serializable {
        @JsonCreator
        public BookRecord(
                @JsonProperty("title") String title,
                @JsonProperty("author") String author,
                @JsonProperty("publisher") String publisher,
                @JsonProperty("priceInCents") String priceInCents,
                @JsonProperty("url") String url) {
                this(
                        title,
                        author,
                        publisher,
                        Conversions.longValue(priceInCents),
                        url
                );
        }
}

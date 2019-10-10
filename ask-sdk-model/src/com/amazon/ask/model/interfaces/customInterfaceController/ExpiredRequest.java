/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the event received by the skill at expiry of an Event Handler.
 */

@JsonDeserialize(builder = ExpiredRequest.Builder.class)
public final class ExpiredRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("expirationPayload")
    private Object expirationPayload = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExpiredRequest(Builder builder) {
        String discriminatorValue = "CustomInterfaceController.Expired";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.expirationPayload != null) {
            this.expirationPayload = builder.expirationPayload;
        }
    }

    /**
     * The unique token specified by the StartEventHandlerDirective.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * The free form JSON object that the skill will receive if and only if the  Event Handler duration expired.
     * @return expirationPayload
    **/
    @JsonProperty("expirationPayload")
    public Object getExpirationPayload() {
        return expirationPayload;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpiredRequest interfacesCustomInterfaceControllerExpiredRequest = (ExpiredRequest) o;
        return Objects.equals(this.token, interfacesCustomInterfaceControllerExpiredRequest.token) &&
            Objects.equals(this.expirationPayload, interfacesCustomInterfaceControllerExpiredRequest.expirationPayload) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, expirationPayload, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpiredRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    expirationPayload: ").append(toIndentedString(expirationPayload)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private String token;
        private Object expirationPayload;

        private Builder() {}

        @JsonProperty("requestId")
        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")
        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")
        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("token")
        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("expirationPayload")
        public Builder withExpirationPayload(Object expirationPayload) {
            this.expirationPayload = expirationPayload;
            return this;
        }


        public ExpiredRequest build() {
            return new ExpiredRequest(this);
        }
    }
}


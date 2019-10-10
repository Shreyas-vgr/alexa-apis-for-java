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


package com.amazon.ask.model.interfaces.display;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BodyTemplate3
 */

@JsonDeserialize(builder = BodyTemplate3.Builder.class)
public final class BodyTemplate3 extends com.amazon.ask.model.interfaces.display.Template  {

    @JsonProperty("backgroundImage")
    private com.amazon.ask.model.interfaces.display.Image backgroundImage = null;

    @JsonProperty("image")
    private com.amazon.ask.model.interfaces.display.Image image = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("textContent")
    private com.amazon.ask.model.interfaces.display.TextContent textContent = null;

    public static Builder builder() {
        return new Builder();
    }

    private BodyTemplate3(Builder builder) {
        String discriminatorValue = "BodyTemplate3";

        this.type = discriminatorValue;
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.backButton != null) {
            this.backButton = builder.backButton;
        }
        if (builder.backgroundImage != null) {
            this.backgroundImage = builder.backgroundImage;
        }
        if (builder.image != null) {
            this.image = builder.image;
        }
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.textContent != null) {
            this.textContent = builder.textContent;
        }
    }

    /**
     * Get backgroundImage
     * @return backgroundImage
    **/
    @JsonProperty("backgroundImage")
    public com.amazon.ask.model.interfaces.display.Image getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Get image
     * @return image
    **/
    @JsonProperty("image")
    public com.amazon.ask.model.interfaces.display.Image getImage() {
        return image;
    }

    /**
     * Get title
     * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Get textContent
     * @return textContent
    **/
    @JsonProperty("textContent")
    public com.amazon.ask.model.interfaces.display.TextContent getTextContent() {
        return textContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BodyTemplate3 interfacesDisplayBodyTemplate3 = (BodyTemplate3) o;
        return Objects.equals(this.backgroundImage, interfacesDisplayBodyTemplate3.backgroundImage) &&
            Objects.equals(this.image, interfacesDisplayBodyTemplate3.image) &&
            Objects.equals(this.title, interfacesDisplayBodyTemplate3.title) &&
            Objects.equals(this.textContent, interfacesDisplayBodyTemplate3.textContent) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backgroundImage, image, title, textContent, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BodyTemplate3 {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
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
        private String token;
        private com.amazon.ask.model.interfaces.display.BackButtonBehavior backButton;
        private com.amazon.ask.model.interfaces.display.Image backgroundImage;
        private com.amazon.ask.model.interfaces.display.Image image;
        private String title;
        private com.amazon.ask.model.interfaces.display.TextContent textContent;

        private Builder() {}

        @JsonProperty("token")
        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("backButton")
        public Builder withBackButton(com.amazon.ask.model.interfaces.display.BackButtonBehavior backButton) {
            this.backButton = backButton;
            return this;
        }


        @JsonProperty("backgroundImage")
        public Builder withBackgroundImage(com.amazon.ask.model.interfaces.display.Image backgroundImage) {
            this.backgroundImage = backgroundImage;
            return this;
        }


        @JsonProperty("image")
        public Builder withImage(com.amazon.ask.model.interfaces.display.Image image) {
            this.image = image;
            return this;
        }


        @JsonProperty("title")
        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("textContent")
        public Builder withTextContent(com.amazon.ask.model.interfaces.display.TextContent textContent) {
            this.textContent = textContent;
            return this;
        }


        public BodyTemplate3 build() {
            return new BodyTemplate3(this);
        }
    }
}


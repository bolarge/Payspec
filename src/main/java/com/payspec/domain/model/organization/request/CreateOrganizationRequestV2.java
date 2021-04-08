package com.payspec.domain.model.organization.request;

public class CreateOrganizationRequestV2 {

    private String name;
    private Boolean avataxEnabled = false;
    private String taxIdentifier;
    private String logoURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvataxEnabled() {
        return avataxEnabled;
    }

    public void setAvataxEnabled(Boolean avataxEnabled) {
        this.avataxEnabled = avataxEnabled;
    }

    public String getTaxIdentifier() {
        return taxIdentifier;
    }

    public void setTaxIdentifier(String taxIdentifier) {
        this.taxIdentifier = taxIdentifier;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    private CreateOrganizationRequestV2() {}

    private CreateOrganizationRequestV2(Builder builder) {
        setName(builder.name);
        setAvataxEnabled(builder.avataxEnabled);
        setLogoURL(builder.logoURL);
        setTaxIdentifier(builder.taxIdentifier);
    }

    public static final class Builder {
        private String name;
        private Boolean avataxEnabled;
        private String taxIdentifier;
        private String logoURL;

        public Builder() {}

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder avataxEnabled(Boolean val) {
            avataxEnabled = val;
            return this;
        }

        public Builder taxIdentifier(String val) {
            taxIdentifier = val;
            return this;
        }

        public Builder logoURL(String val) {
            logoURL = val;
            return this;
        }

        public CreateOrganizationRequestV2 build() {
            return new CreateOrganizationRequestV2(this);
        }
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 validation override settings.
 */
public class X12ValidationOverride {
    /**
     * The message id on which the validation settings has to be applied.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * The value indicating whether to validate EDI types.
     */
    @JsonProperty(value = "validateEDITypes", required = true)
    private boolean validateEDITypes;

    /**
     * The value indicating whether to validate XSD types.
     */
    @JsonProperty(value = "validateXSDTypes", required = true)
    private boolean validateXSDTypes;

    /**
     * The value indicating whether to allow leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "allowLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean allowLeadingAndTrailingSpacesAndZeroes;

    /**
     * The value indicating whether to validate character Set.
     */
    @JsonProperty(value = "validateCharacterSet", required = true)
    private boolean validateCharacterSet;

    /**
     * The value indicating whether to trim leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "trimLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean trimLeadingAndTrailingSpacesAndZeroes;

    /**
     * The trailing separator policy. Possible values include: 'NotSpecified',
     * 'NotAllowed', 'Optional', 'Mandatory'.
     */
    @JsonProperty(value = "trailingSeparatorPolicy", required = true)
    private TrailingSeparatorPolicy trailingSeparatorPolicy;

    /**
     * Get the message id on which the validation settings has to be applied.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the message id on which the validation settings has to be applied.
     *
     * @param messageId the messageId value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the value indicating whether to validate EDI types.
     *
     * @return the validateEDITypes value
     */
    public boolean validateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * Set the value indicating whether to validate EDI types.
     *
     * @param validateEDITypes the validateEDITypes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withValidateEDITypes(boolean validateEDITypes) {
        this.validateEDITypes = validateEDITypes;
        return this;
    }

    /**
     * Get the value indicating whether to validate XSD types.
     *
     * @return the validateXSDTypes value
     */
    public boolean validateXSDTypes() {
        return this.validateXSDTypes;
    }

    /**
     * Set the value indicating whether to validate XSD types.
     *
     * @param validateXSDTypes the validateXSDTypes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withValidateXSDTypes(boolean validateXSDTypes) {
        this.validateXSDTypes = validateXSDTypes;
        return this;
    }

    /**
     * Get the value indicating whether to allow leading and trailing spaces and zeroes.
     *
     * @return the allowLeadingAndTrailingSpacesAndZeroes value
     */
    public boolean allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * Set the value indicating whether to allow leading and trailing spaces and zeroes.
     *
     * @param allowLeadingAndTrailingSpacesAndZeroes the allowLeadingAndTrailingSpacesAndZeroes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withAllowLeadingAndTrailingSpacesAndZeroes(boolean allowLeadingAndTrailingSpacesAndZeroes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
        return this;
    }

    /**
     * Get the value indicating whether to validate character Set.
     *
     * @return the validateCharacterSet value
     */
    public boolean validateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * Set the value indicating whether to validate character Set.
     *
     * @param validateCharacterSet the validateCharacterSet value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withValidateCharacterSet(boolean validateCharacterSet) {
        this.validateCharacterSet = validateCharacterSet;
        return this;
    }

    /**
     * Get the value indicating whether to trim leading and trailing spaces and zeroes.
     *
     * @return the trimLeadingAndTrailingSpacesAndZeroes value
     */
    public boolean trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * Set the value indicating whether to trim leading and trailing spaces and zeroes.
     *
     * @param trimLeadingAndTrailingSpacesAndZeroes the trimLeadingAndTrailingSpacesAndZeroes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withTrimLeadingAndTrailingSpacesAndZeroes(boolean trimLeadingAndTrailingSpacesAndZeroes) {
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
        return this;
    }

    /**
     * Get the trailing separator policy. Possible values include: 'NotSpecified', 'NotAllowed', 'Optional', 'Mandatory'.
     *
     * @return the trailingSeparatorPolicy value
     */
    public TrailingSeparatorPolicy trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * Set the trailing separator policy. Possible values include: 'NotSpecified', 'NotAllowed', 'Optional', 'Mandatory'.
     *
     * @param trailingSeparatorPolicy the trailingSeparatorPolicy value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withTrailingSeparatorPolicy(TrailingSeparatorPolicy trailingSeparatorPolicy) {
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        return this;
    }

}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to regenerate the keys within the database account.
 */
public class DatabaseAccountRegenerateKeyParameters {
    /**
     * The access key to regenerate. Possible values include: 'primary',
     * 'secondary', 'primaryReadonly', 'secondaryReadonly'.
     */
    @JsonProperty(value = "keyKind", required = true)
    private KeyKind keyKind;

    /**
     * Get the keyKind value.
     *
     * @return the keyKind value
     */
    public KeyKind keyKind() {
        return this.keyKind;
    }

    /**
     * Set the keyKind value.
     *
     * @param keyKind the keyKind value to set
     * @return the DatabaseAccountRegenerateKeyParameters object itself.
     */
    public DatabaseAccountRegenerateKeyParameters withKeyKind(KeyKind keyKind) {
        this.keyKind = keyKind;
        return this;
    }

}

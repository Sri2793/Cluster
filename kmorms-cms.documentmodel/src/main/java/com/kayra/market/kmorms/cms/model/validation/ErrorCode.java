package com.kayra.market.kmorms.cms.model.validation;


public enum ErrorCode {
    INVALID_OUTLET_CONFIG,
    GENERIC,
    OUTLET_MERCHANT_ACCOUNT_NOT_CONFIGURED,
    MARKET_MERCHANT_ACCOUNT_NOT_CONFIGURED,
    NOT_FOUND,
    NO_PAYMENT_ID,
    OUTLET_CLOSED,
    PAYMONEY_ERROR,
    DUPLICATE_ITEM,

    INCOMPLETE_RECIPE,
    INVALID_CHOICE,
    INVALID_PRODUCT,
    NO_PRICE,
    OUT_OF_STOCK,
    TOTAL_NOT_MATCHED,
    TAKEAWAY_NOT_ENABLED,
    TAKEAWAY_NOT_AVAILABLE,
    ORDER_EXCEEDS_MAX,

    TABLEBOOKING_NOT_ENABLED,
    PARTY_SIZE_TOO_BIG,
    PARTY_SIZE_TOO_SMALL,
    NO_SLOTS,
    INVALID_DATE,
    INVALID_SESSION,
    INVALID_REQUEST,
    LOCATION_NOT_FOUND,
    LOCATION_NOT_ENABLED,
    INVALID_TOKEN_PASSWORD,
    RESERVATION_NOT_FOUND,
    RESERVATION_ALREADY_CANCELED,
    SLOT_NO_LONGER_AVAILABLE

}

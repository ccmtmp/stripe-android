package com.stripe.android.model

import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class CardMetadata internal constructor(
    val binPrefix: String,
    val accountRanges: List<AccountRange>
) : StripeModel {

    @Parcelize
    internal data class AccountRange internal constructor(
        val binRange: BinRange,
        val panLength: Int,
        val brandName: String,
        val brand: CardBrand,
        val country: String? = null
    ) : StripeModel
}

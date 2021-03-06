package com.stripe.android.cards

import com.stripe.android.model.BinRange
import com.stripe.android.model.CardBrand
import com.stripe.android.model.CardMetadata

internal object AccountRangeFixtures {
    val DEFAULT = listOf(
        CardMetadata.AccountRange(
            binRange = BinRange(
                low = "4242420000000000",
                high = "4242424239999999"
            ),
            panLength = 16,
            brand = CardBrand.Visa,
            brandName = CardBrand.Visa.name,
            country = "GB"
        ),
        CardMetadata.AccountRange(
            binRange = BinRange(
                low = "4242424240000000",
                high = "4242424249999999"
            ),
            panLength = 16,
            brand = CardBrand.Visa,
            brandName = CardBrand.Visa.name,
            country = "GB"
        )
    )
}

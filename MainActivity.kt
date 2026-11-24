package com.abasin.marketradar

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {
    private val bg = Color.rgb(7, 19, 31)
    private val panel = Color.rgb(15, 34, 49)
    private val muted = Color.rgb(155, 174, 190)
    private val green = Color.rgb(0, 210, 145)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val scroll = ScrollView(this).apply { setBackgroundColor(bg) }
        val page = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(22, 28, 22, 28)
        }
        scroll.addView(page)
        setContentView(scroll)

        page.addView(text("ABASIN MARKET RADAR", 23, Color.WHITE, true))
        page.addView(text("BTC • 10-minute lead/lag monitor", 14, muted, false))
        page.addView(space(18))

        val notice = TextView(this).apply {
            text = "LIVE FEEDS NOT CONNECTED  •  Prototype"
            setTextColor(Color.rgb(255, 196, 80))
            textSize = 12f
            setPadding(14, 12, 14, 12)
            setBackgroundColor(Color.rgb(55, 43, 23))
        }
        page.addView(notice)
        page.addView(space(16))

        page.addView(section("SPOT MARKET"))
        marketCard(page, "BINANCE SPOT", "BTC/USDT", "Waiting for live API")
        marketCard(page, "MEXC SPOT", "BTC/USDT", "Waiting for live API")

        page.addView(space(10))
        page.addView(section("FUTURES MARKET"))
        marketCard(page, "BINANCE USDⓈ-M FUTURES", "BTCUSDT Perpetual", "Waiting for live API")
        marketCard(page, "MEXC FUTURES", "BTC_USDT Perpetual", "Waiting for live API")

        page.addView(space(10))
        page.addView(section("CFD MARKET"))
        marketCard(page, "CAPITAL.COM CFD", "Bitcoin instrument", "Waiting for authorized API connection")

        page.addView(space(12))
        page.addView(section("LEAD / LAG ANALYSIS"))
        val lead = TextView(this).apply {
            text = "First mover: Not determined\\n\\nThe app will compare timestamped trades and mid-prices, then measure which venue moved first. A lead signal requires repeated observations; one price tick is not proof."
            setTextColor(Color.WHITE); textSize = 14f; setLineSpacing(5f, 1f)
            setPadding(16, 16, 16, 16); setBackgroundColor(panel)
        }
        page.addView(lead)

        page.addView(space(12))
        page.addView(section("10-MINUTE WINDOW"))
        page.addView(text("Spot, Futures and CFD are analyzed separately. Spread, price basis, feed delay and timestamp quality are shown independently to avoid false comparisons.", 13, muted, false))
        page.addView(space(18))
        page.addView(text("Safety: Read-only market monitoring. No trading or withdrawals.", 12, muted, false))
    }

    private fun text(value: String, size: Int, color: Int, bold: Boolean): TextView =
        TextView(this).apply {
            text = value; textSize = size.toFloat(); setTextColor(color)
            if (bold) setTypeface(null, android.graphics.Typeface.BOLD)
        }

    private fun section(value: String) = TextView(this).apply {
        text = value; textSize = 13f; setTextColor(green)
        setTypeface(null, android.graphics.Typeface.BOLD)
        setPadding(0, 8, 0, 8)
    }

    private fun marketCard(parent: LinearLayout, venue: String, symbol: String, status: String) {
        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 14, 16, 14)
            setBackgroundColor(panel)
        }
        card.addView(text(venue, 14, Color.WHITE, true))
        card.addView(text(symbol, 12, muted, false))
        card.addView(space(7))
        card.addView(text("Price: —", 20, Color.WHITE, true))
        card.addView(text(status, 12, muted, false))
        val lp = LinearLayout.LayoutParams(-1, -2)
        lp.bottomMargin = 9
        parent.addView(card, lp)
    }

    private fun space(height: Int) = TextView(this).apply { this.height = height }
}

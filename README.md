# ABASIN MARKET RADAR (Android starter)

This is an Android Studio Kotlin starter project for a market-comparison dashboard.

## Current scope
- Separate rows for Binance Spot, Binance Futures, MEXC Spot, MEXC Futures, and Capital.com CFD.
- 10-minute observation window and lead/lag event log UI.
- Clearly labels sample values as unavailable until live adapters are connected.
- No trading, order placement, withdrawal, or account credentials.

## Build
1. Open this folder in Android Studio.
2. Allow Gradle sync.
3. Build > Build Bundle(s) / APK(s) > Build APK(s).

## Important
This package is Android source, not a compiled APK. Live feeds are not yet connected.
Before production use, implement and test each provider adapter against its official API.
Never place API secrets in the app. Use read-only keys and a secure backend if authenticated data is later needed.

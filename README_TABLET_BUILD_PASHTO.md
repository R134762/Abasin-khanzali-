# ABASIN MARKET RADAR — د Android ټابلیټ له لارې APK جوړول

## څه ته اړتیا ده؟
- Android ټابلیټ او Chrome
- وړیا GitHub حساب
- انټرنېټ

## ګامونه
1. په Chrome کې https://github.com ته لاړ شئ او Sign up / Sign in وکړئ.
2. د `+` تڼۍ ووهئ او `New repository` انتخاب کړئ.
3. د Repository نوم `abasin-market-radar` ولیکئ، `Public` یا `Private` انتخاب کړئ، او `Create repository` ووهئ.
4. په Repository کې `Add file` > `Upload files` انتخاب کړئ.
5. د دې ZIP ټول فایلونه Extract کړئ؛ د فولډر دننه ټول فایلونه او `.github` پټ فولډر هم انتخاب او Upload کړئ. د ZIP فایل پخپله مه پورته کوئ.
6. د پاڼې په پای کې `Commit changes` ووهئ.
7. د Repository له پاسه `Actions` ته لاړ شئ. `Build ABASIN MARKET RADAR APK` workflow انتخاب کړئ او که اړتیا وي `Run workflow` ووهئ.
8. کله چې Build بشپړ او شین شي، هماغه Run خلاص کړئ. د `Artifacts` لاندې `ABASIN-MARKET-RADAR-debug-apk` ډاونلوډ کړئ.
9. ZIP Artifact په ټابلیټ کې Extract کړئ، `app-debug.apk` خلاص کړئ او Install یې کړئ. که Android اجازه وغواړي، یوازې د هماغه فایل/براوزر لپاره د دې سرچینې له لارې Install اجازه ورکړئ.

## مهم
- دا workflow د Debug APK جوړوي؛ د خپرولو لپاره لاسلیک شوی Release APK نه دی.
- اوسنی اپ Prototype دی. د Binance، MEXC او Capital.com Live market feeds لا نه دي وصل شوي؛ نو د واقعي قیمتونو او سیګنالونو ادعا نه کوي.
- د API Secret، پاسورډ یا د Binance/MEXC د حساب معلومات په GitHub یا اپ کې مه پورته کوئ.

require: weather.sc
require: currency.sc

theme: /

    state: /hello

        q!: *

        if: !$request.query || $request.query == "/start" || $request.query == "start"
            a:

        elseif: $request.query.toLowerCase().match(/привет|здравствуй|hello|hi|добрый день|доброе утро|добрый вечер/)
            a:
                Привет!
                Я бот-помощник.
                Могу рассказать:
                - погоду
                - курс валют

        elseif: $request.query.toLowerCase().match(/погод|weather|температур|прогноз|дожд|снег|холод|жарк/)
            go!: /weather

        elseif: $request.query.toLowerCase().match(/курс|валют|доллар|евро|usd|eur|обмен|сколько стоит|юань|cny/)
            go!: /currency

        else:
            a:
                Я не понял запрос.

                Попробуйте спросить:
                - Какая погода?
                - Курс доллара
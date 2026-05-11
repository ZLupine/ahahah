require: weather.sc
require: currency.sc

theme: /

    state: /hello

        q!: *

        if: !$request.query
            a:

        elseif: $request.query.toLowerCase().match(/привет|здравствуй|hello|hi|добрый день/)
            a:
                Привет!
                Я бот-помощник.
                Могу рассказать:
                - погоду
                - курс валют

        elseif: $request.query.toLowerCase().match(/погода|weather|температура|прогноз/)
            go!: /weather

        elseif: $request.query.toLowerCase().match(/курс|валют|доллар|евро|currency|usd|eur/)
            go!: /currency

        else
            a:
                Я не понял запрос.

                Попробуйте спросить:
                - Какая погода?
                - Курс доллара
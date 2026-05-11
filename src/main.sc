require: weather.sc
require: currency.sc

theme: /

    state: /hello

        q!: привет
        q!: здравствуй
        q!: hello
        q!: hi
        q!: добрый день

        a:
            Привет!
            Я бот-помощник.
            Могу рассказать:
            - погоду
            - курс валют


    state: /weather_router

        q!: *погод*
        q!: *прогноз*
        q!: *температур*

        go!: /weather


    state: /currency_router

        q!: *курс*
        q!: *валют*
        q!: *доллар*
        q!: *евро*
        q!: *usd*
        q!: *eur*

        go!: /currency


    state: /NoMatch

        event!: noMatch

        a:
            Я не понял запрос.

            Попробуйте спросить:
            - Какая погода?
            - Курс доллара
require: weather.sc
require: currency.sc

theme: /
    state: /hello
        intent!: /hello
        q!: *start
        q!: *(привет/здравствуй/hello/hi/добрый день/доброе утро/добрый вечер)*
        a:
            Привет!
            Я бот-помощник.
            Могу рассказать:
            - погоду
            - курс валют
    
    state: /weather
        intent!: /weather
        q!: *(погод/weather/температур/прогноз/дожд/снег/холод/жарк)*
        go!: /weather
     
    state: /currency
        intent!: /currency
        q!: *(курс/валют/доллар/евро/usd/eur/обмен/сколько стоит/юань/cny)*
        go!: /currency
        
    state: /NoMatch
        event!: /noMatch
        a:
            Я не понял запрос.
            Попробуйте спросить:
            - Какая погода?
            - Курс доллара
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
    
    state: /NoMatch
        event: noMatch
        a:
            Я не понял запрос.
            Попробуйте спросить:
            - Какая погода?
            - Курс доллара
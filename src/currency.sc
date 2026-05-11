theme: /
state: /currency
    intent!: /currency
    q!: *(курс/валют/доллар/евро/usd/eur/обмен/сколько стоит/юань/cny)*

    if: $request.query.toLowerCase().match(/доллар|usd/)
        a:
            Курс доллара примерно 90 рублей.

    elseif: $request.query.toLowerCase().match(/евро|eur/)
        a:
            Курс евро примерно 100 рублей.

    elseif: $request.query.toLowerCase().match(/юань|cny/)
        a:
            Курс юаня примерно 12 рублей.

    else:
        a:
            Доступные валюты:
            - доллар
            - евро
            - юань
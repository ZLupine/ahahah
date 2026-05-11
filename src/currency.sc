theme: /

    state: /currency
        q!: *

        if: $request.query.toLowerCase().match(/доллар|usd/)
            a:
                Курс доллара примерно 90 рублей.

        elseif: $request.query.toLowerCase().match(/евро|eur/)
            a:
                Курс евро примерно 100 рублей.

        else:
            a:
                Доступные валюты:
                - доллар
                - евро
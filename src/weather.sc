theme: /

    state: /weather

        if: $request.query.toLowerCase().match(/москва/)
            a:
                В Москве сейчас около +20°C.

        elseif: $request.query.toLowerCase().match(/санкт|питер/)
            a:
                В Санкт-Петербурге около +17°C.

        else:
            a:
                Сейчас хорошая погода ☀️
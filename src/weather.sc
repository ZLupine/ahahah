theme: /
state: /weather
    intent!: /weather
    q!: *(погод/weather/температур/прогноз/дожд/снег/холод/жарк)*

    if: $request.query.toLowerCase().match(/моск/)
        a:
            В Москве сейчас около +20°C.

    elseif: $request.query.toLowerCase().match(/санкт|питер/)
        a:
            В Санкт-Петербурге около +17°C.

    elseif: $request.query.toLowerCase().match(/новосибир/)
        a:
            В Новосибирске около +15°C.

    else:
        a:
            Сейчас хорошая погода ☀️
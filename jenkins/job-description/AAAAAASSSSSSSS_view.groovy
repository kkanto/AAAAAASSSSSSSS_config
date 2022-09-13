 
listView('AAAAAASSSSSSSS Jobs') {
    description('AAAAAASSSSSSSS Jobs')
    jobs {
        regex('AAAAAASSSSSSSS_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

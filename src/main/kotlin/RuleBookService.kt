


fun main(Array<String>) {
    val ruleBook: RuleBook = RuleBookBuilder.create()
        .addRule { rule ->
            rule.withNoSpecifiedFactType()
                .then { f -> System.out.print("Hello ") }
                .then { f -> System.out.println("World") }
        }
        .build()
}
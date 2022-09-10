package libraries.github

def call(){
    println('impls step ')
    List options = ['github', 'github_enterprise']
    String impl = config.source_type

    return options.contains(impl) ? getBinding().getStep(impl) :
            { error "github.config.source_type: ${impl} is not a valid option; should be one of: ${options.join(", ")}" } ()
}

grails.project.work.dir = 'target'
grails.project.docs.output.dir = 'docs/manual' // for backwards-compatibility, the docs are checked into gh-pages branch
grails.project.source.level = 1.6

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()

		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile('org.liquibase:liquibase-core:2.0.3') {
			excludes 'junit', 'easymockclassextension', 'ant', 'servlet-api', 'spring'
		}
	}

	plugins {
		build(':release:2.0.0', ':rest-client-builder:1.0.2') {
			export = false
		}
		compile(":hibernate:$grailsVersion") {
			export = false
		}
	}
}

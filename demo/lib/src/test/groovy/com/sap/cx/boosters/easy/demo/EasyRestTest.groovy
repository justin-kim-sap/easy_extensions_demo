/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package com.sap.cx.boosters.easy.demo

import spock.lang.Specification
import spock.lang.Unroll
import groovyx.net.http.HttpResponseDecorator
import groovyx.net.http.RESTClient
import static org.apache.http.HttpStatus.SC_OK


class EasyRestTest extends Specification {
    def restClient = new RESTClient( "https://localhost:9002")

    def "test restClient"() {

        when:
        restClient.ignoreSSLIssues()
        HttpResponseDecorator response = restClient.get(path: '/easyrest/testGet', query:[firstname:'Yannick'])

        then:
        with(response) {
            status == SC_OK
        }


    }
}
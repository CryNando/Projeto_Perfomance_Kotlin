package com.example.projeto_perfomance_kotlin.models

data class IPGeolocation(
    var asn: String?,
    var calling_code: String?,
    var city: String?,
    var connection_type: String?,
    var continent_code: String?,
    var continent_name: String?,
    var country_capital: String?,
    var country_code2: String?,
    var country_code3: String?,
    var country_flag: String?,
    var country_name: String?,
    var country_tld: String?,
    var currency: Currency?,
    var district: String?,
    var geoname_id: String?,
    var hostname: String?,
    var ip: String?,
    var is_eu: Boolean?,
    var isp: String?,
    var languages: String?,
    var latitude: String?,
    var longitude: String?,
    var organization: String?,
    var state_prov: String?,
    var time_zone: TimeZone?,
    var zipcode: String?
)

data class Currency(
    var code: String?,
    var name: String?,
    var symbol: String?
)

data class TimeZone(
    var current_time: String?,
    var current_time_unix: String?,
    var dst_savings: String?,
    var is_dst: String?,
    var name: String?,
    var offset: String?
)
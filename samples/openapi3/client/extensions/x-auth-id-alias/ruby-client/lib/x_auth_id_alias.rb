=begin
#OpenAPI Extension x-auth-id-alias

#This specification shows how to use x-auth-id-alias extension for API keys.

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
Generator version: 7.5.0-SNAPSHOT

=end

# Common files
require 'x_auth_id_alias/api_client'
require 'x_auth_id_alias/api_error'
require 'x_auth_id_alias/version'
require 'x_auth_id_alias/configuration'

# Models

# APIs
require 'x_auth_id_alias/api/usage_api'

module XAuthIDAlias
  class << self
    # Customize default settings for the SDK using block.
    #   XAuthIDAlias.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end

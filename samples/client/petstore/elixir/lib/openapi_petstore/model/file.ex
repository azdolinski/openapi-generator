# NOTE: This file is auto generated by OpenAPI Generator 7.5.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.File do
  @moduledoc """
  Must be named `File` for test.
  """

  @derive Jason.Encoder
  defstruct [
    :sourceURI
  ]

  @type t :: %__MODULE__{
    :sourceURI => String.t | nil
  }

  def decode(value) do
    value
  end
end


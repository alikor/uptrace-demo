output "instrumentation_key" {
  value = azurerm_application_insights.default.instrumentation_key
  sensitive = true
}
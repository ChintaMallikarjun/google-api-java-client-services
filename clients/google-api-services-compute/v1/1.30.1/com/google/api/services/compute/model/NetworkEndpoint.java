/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * The network endpoint. Next ID: 7
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpoint extends com.google.api.client.json.GenericJson {

  /**
   * Optional fully qualified domain name of network endpoint. This can only be specified when
   * NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fqdn;

  /**
   * The name for a specific VM instance that the IP address belongs to. This is required for
   * network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
   * endpoint group.
   *
   * The name must be 1-63 characters long, and comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine
   * (either the primary IP or as part of an aliased IP range). If the IP address is not specified,
   * then the primary IP address for the VM instance in the network that the network endpoint group
   * belongs to will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * Optional port number of network endpoint. If not specified and the
   * NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network
   * endpoint group will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Optional fully qualified domain name of network endpoint. This can only be specified when
   * NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * @return value or {@code null} for none
   */
  public java.lang.String getFqdn() {
    return fqdn;
  }

  /**
   * Optional fully qualified domain name of network endpoint. This can only be specified when
   * NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * @param fqdn fqdn or {@code null} for none
   */
  public NetworkEndpoint setFqdn(java.lang.String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

  /**
   * The name for a specific VM instance that the IP address belongs to. This is required for
   * network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
   * endpoint group.
   *
   * The name must be 1-63 characters long, and comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * The name for a specific VM instance that the IP address belongs to. This is required for
   * network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
   * endpoint group.
   *
   * The name must be 1-63 characters long, and comply with RFC1035.
   * @param instance instance or {@code null} for none
   */
  public NetworkEndpoint setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine
   * (either the primary IP or as part of an aliased IP range). If the IP address is not specified,
   * then the primary IP address for the VM instance in the network that the network endpoint group
   * belongs to will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine
   * (either the primary IP or as part of an aliased IP range). If the IP address is not specified,
   * then the primary IP address for the VM instance in the network that the network endpoint group
   * belongs to will be used.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public NetworkEndpoint setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Optional port number of network endpoint. If not specified and the
   * NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network
   * endpoint group will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Optional port number of network endpoint. If not specified and the
   * NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network
   * endpoint group will be used.
   * @param port port or {@code null} for none
   */
  public NetworkEndpoint setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  @Override
  public NetworkEndpoint set(String fieldName, Object value) {
    return (NetworkEndpoint) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpoint clone() {
    return (NetworkEndpoint) super.clone();
  }

}

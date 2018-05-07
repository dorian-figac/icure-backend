/**
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import * as models from './models';

export class PartnershipDto {
 constructor(json: JSON| any) {
    Object.assign(this as PartnershipDto, json)
 }
    partnershipDescription?: string;

    type?: PartnershipDto.TypeEnum;

    status?: PartnershipDto.StatusEnum;

    meToOtherRelationshipDescription?: string;

    otherToMeRelationshipDescription?: string;

    partnerId?: string;

}
export namespace PartnershipDto {
    export enum TypeEnum {
        PrimaryContact = <any> 'primary_contact',
        PrimaryContactFor = <any> 'primary_contact_for',
        Tutor = <any> 'tutor',
        Family = <any> 'family',
        Friend = <any> 'friend',
        Counselor = <any> 'counselor',
        Contact = <any> 'contact'
    }
    export enum StatusEnum {
        Active = <any> 'active',
        Complicated = <any> 'complicated',
        Past = <any> 'past'
    }
}